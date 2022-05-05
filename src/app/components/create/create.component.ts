import { Component, OnInit } from '@angular/core';
import { FileUploadComponent } from '../file-upload/file-upload.component';
import { Router, RouterLink } from '@angular/router';
import { FileUploadService } from 'src/app/services/file-upload.service';
import { Doc } from 'src/app/doc';
@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  types = ["pdf","excel","word"];
  
  public doc:Doc= new Doc();
  public docs!:Doc[];
  constructor(private uploadService: FileUploadService,public route:Router) { }


  ngOnInit(): void {
    this.getdata();
  }
  onsubmit(){
    console.log(this.doc)
    this.addval()
  }
  addval(){
    this.uploadService.addval(this.doc).subscribe(data=>console.log(data),error=>console.log(error));
      this.doc=new Doc();
      // this.route.navigate([`../file-upload`]);
  }
  getdata(){
    this.uploadService.getval().subscribe(data=>{
      this.docs=data
      console.log(data)
    })
  }
}
