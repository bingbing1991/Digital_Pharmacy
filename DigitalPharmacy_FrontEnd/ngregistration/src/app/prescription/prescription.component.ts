import { Component, OnInit } from '@angular/core';
import { PrescriptionService } from '../prescription.service';
import { Prescription } from '../prescription';
import { Router } from '@angular/router';

@Component({
  selector: 'app-prescription',
  templateUrl: './prescription.component.html',
  styleUrls: ['./prescription.component.css']
})
export class PrescriptionComponent implements OnInit {
  prescription = new Prescription();
  msg='';

  constructor(private _service : PrescriptionService,
    private _router : Router )
  {

  }

  ngOnInit(): void {
  }

  createPrescription()
  {
    this._service.createPrescriptionFromJavaSide(this.prescription).subscribe(
      data => {
        console.log("response received");
        this._router.navigate([''])
    },
      error => { 
        console.log("exception occured");
        this.msg=error.error;
      }
    )
  }
  
}
