import { Component, OnInit } from '@angular/core';
import { DashboardService } from './dashboard.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  defaultElevation = 2;
  raisedElevation = 8;
  public jobId;
  public jobs: any;
  titleSelected;

  constructor(private dashboardService: DashboardService,
    private router: Router,) { }

  ngOnInit() {
    console.log("hi.......");
    const getAllJobUrl = 'http://localhost:8060/job'
    this.dashboardService.getAllJobs(getAllJobUrl).subscribe(res =>{
      this.jobs = res
      console.log("listof jobs", this.jobs);
    });

  }


  viewJobDetails(id){
    this.router.navigate(['/job', id]);
  }


}
