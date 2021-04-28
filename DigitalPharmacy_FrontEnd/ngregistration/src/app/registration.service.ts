import { Injectable } from '@angular/core';
import { fromEventPattern, Observable } from 'rxjs';
import { User } from './user';
import { HttpClient } from '@angular/common/http' 

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  //inject the https client dependencies into the constructor into the service
  constructor(private _http : HttpClient) { }

  public loginUserFromJavaSide(user: User):Observable<any>
  {
    return this._http.post<any>("http://localhost:8090/LoginUser",user);
  }

  public registerUserFromJavaSide(user: User):Observable<any>
  {
    return this._http.post<any>("http://localhost:8090/registerUser",user);
  }
}
