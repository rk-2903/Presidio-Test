import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { JobViewService } from './job-view.service';

@Component({
  selector: 'app-job-view',
  templateUrl: './job-view.component.html',
  styleUrls: ['./job-view.component.css']
})
export class JobViewComponent implements OnInit {

  selectedJob;

  constructor(private route: ActivatedRoute,
    private jobService: JobViewService) { }

  ngOnInit() {
    console.log("job-view");
    const id = this.route.snapshot.paramMap.get('id');
    const getJobById = 'http://localhost:8060/job/'+id;
    console.log("job id: ", id);
    this.jobService.getJobId(getJobById).subscribe(res => {
      this.selectedJob = res;
    })
  }

}
