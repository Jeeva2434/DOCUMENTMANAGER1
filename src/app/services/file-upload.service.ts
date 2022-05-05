import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Doc } from '../doc';

@Injectable({
  providedIn: 'root'
})
export class FileUploadService {

  constructor(private http: HttpClient) { }

  public baseUrl = 'http://localhost:8080';
  
  upload(file: File): Observable<HttpEvent<any>> {
    const formData: FormData = new FormData();
    formData.append('file', file);

    const req = new HttpRequest('POST', `${this.baseUrl}/upload`, formData,{
      reportProgress: true,
      responseType: 'json'
    });
    
    return this.http.request(req);
  }
  
  getFiles(): Observable<any> {
    return this.http.get(`${this.baseUrl}/files`);
  }
  delval(id:string){
    console.log("del service");
    return this.http.delete(`${this.baseUrl}/deleteById/${id}`);   
  }
  // jee:Doc = {"id":"1a","docName":"j","docDesc":"jd"}
  public addval(Doc:any):Observable<any>{
    console.log(Doc)
    return this.http.post<any>(`${this.baseUrl}/adddoc`,Doc)
  }
  
  public getval():Observable<Doc[]>{
    return  this.http.get<Doc[]>(`${this.baseUrl}/getdoc`)
}
  
  // delval(id:string){
  //   console.log("del service");
  //   return this.http.delete(`${this.baseUrl}/deleteById/${id}`);
  // }
  
  // update(id:string,data:string) {
  //   return this.http.put(`${this.baseUrl}/${id}`,data);
  // }
  
}