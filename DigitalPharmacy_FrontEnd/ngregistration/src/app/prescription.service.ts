import { Injectable } from '@angular/core';
import { fromEventPattern, Observable } from 'rxjs';
import { Prescription } from './prescription';
import { HttpClient } from '@angular/common/http' 

@Injectable({
  providedIn: 'root'
})
export class PrescriptionService {
  //inject the https client dependencies into the constructor into the service
  constructor(private _http : HttpClient) { }

  public createPrescriptionFromJavaSide(prescription: Prescription):Observable<any>
  {
    return this._http.post<any>("http://localhost:8090/createPrescription",prescription);
  }

}
