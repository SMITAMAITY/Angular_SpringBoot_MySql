import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormControl } from '@angular/forms';
import { FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-form-one',
  templateUrl: './form-one.component.html',
  styleUrls: ['./form-one.component.css']
})
export class FormOneComponent implements OnInit {

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








url:string= "http://localhost:8080/DemandDetails";
  userForm: FormGroup;
  jrRRID: number;
  jobTitle:string;
  jobOverview:string;
  experience:number;
  skillsRequired:string;
  requestorId:string;
  requestorPUBU:string;
  requestorDepartment:string;
  result:any;

  constructor(private http:HttpClient,private router: Router, private formBuilder: FormBuilder) { }

  ngOnInit() {
   this.userForm = this.formBuilder.group({
  jrRRID:new FormControl(null, Validators.required),
  jobTitle:[],
  jobOverview:[],
  experience:[],
  skillsRequired:[],
  requestorId:[],
  requestorPUBU:[],
  requestorDepartment:[]

   });
  }

  submit():void{
    // alert('login');
   // let url = this.url+"/"+this.Username+"/"+this.password;
  //  alert(this.url);
   this.http.post(this.url,this.userForm.value).subscribe(data=>{
    //alert('Login is successful');
    
    this.result = data;

    this.router.navigate(['two']);
   });
 
  }
}