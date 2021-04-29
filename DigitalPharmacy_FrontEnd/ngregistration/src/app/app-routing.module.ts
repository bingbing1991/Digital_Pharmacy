import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomePageComponent } from './home-page/home-page.component';
import { RegistrationComponent } from './registration/registration.component';
import { PrescriptionComponent } from './prescription/prescription.component';

const routes: Routes = [
  {path:"", component:LoginComponent},
  {path:"homepage", component:HomePageComponent},
  {path:"registration", component:RegistrationComponent},
  {path:"prescription", component:PrescriptionComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
