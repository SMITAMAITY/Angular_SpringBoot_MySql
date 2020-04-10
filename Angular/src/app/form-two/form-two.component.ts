import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormControl} from '@angular/forms';
import { FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-form-two',
  templateUrl: './form-two.component.html',
  styleUrls: ['./form-two.component.css']
})
export class FormTwoComponent implements OnInit {

  // data:any;

  // entry = new FormGroup({
  //   rrid: new FormControl(null, Validators.required),
  //   title:new FormControl(null, Validators.required),
  //   overview:new FormControl(null, Validators.required),
  //   experience:new FormControl(null, Validators.required),
  //   skills:new FormControl(null, Validators.required),
  //   requestorid:new FormControl(null, Validators.required),
  //   units:new FormControl(null, Validators.required),
  //   requestordept:new FormControl(null, Validators.required)
  // });


  // constructor(private router : Router) { }

  // ngOnInit(): void {
  // }

  // submit(){
  //   this.data=JSON.stringify(this.entry.value);
  //   this.router.navigateByUrl('two');
  // }








  url:string= "http://localhost:8080/RecruitmentUnderstanding";
  userForm: FormGroup;
  jobTitle:string;
  jobOverview:string;
  resourcesNeeded:number;
  skillsRequired:string;
  criteria:string;
  requestorId:string;
  requestorPUBU:string;
  requestorDepartment:string;
  result:any;

  constructor(private http:HttpClient,private router: Router, private formBuilder: FormBuilder) { }

  ngOnInit() {
   this.userForm = this.formBuilder.group({
  jrRRID:new FormControl(null, Validators.required),
  jobTitle:new FormControl(null, Validators.required),
  jobOverview:new FormControl(null, Validators.required),
  resourcesNeeded:new FormControl(null, Validators.required),
  skillsRequired:new FormControl(null, Validators.required),
  criteria:new FormControl(null, Validators.required),
  requestorId:new FormControl(null, Validators.required),
  requestorPUBU:new FormControl(null, Validators.required),
  requestorDepartment:new FormControl(null, Validators.required)
   });
  }

  submit():void{
 
   this.http.post(this.url,this.userForm.value).subscribe(data=>{
    alert('successful');
    
    this.result = data;

    this.router.navigate(['']);
   });

  }
}