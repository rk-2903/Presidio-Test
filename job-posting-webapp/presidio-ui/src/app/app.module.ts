import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CreateJobComponent } from './create-job/create-job.component';
import { MatCardModule } from '@angular/material/card';
import { SharedModule } from './shared/shared.module';
import { HttpClientModule } from '@angular/common/http';
import { JobViewComponent } from './job-view/job-view.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    CreateJobComponent,
    JobViewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatCardModule,
    SharedModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
