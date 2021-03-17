import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateJobComponent } from './create-job/create-job.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { JobViewComponent } from './job-view/job-view.component';


const routes: Routes = [
  { path: '', component: DashboardComponent, pathMatch: 'full'},
  { path: 'job/:id', component: JobViewComponent, pathMatch: 'full'},
  { path: 'create-job', component: CreateJobComponent, pathMatch: 'full' },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
