import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class JobViewService {

  constructor(private http: HttpClient) { }

  getJobId(url): Observable<any> {
    return this.http.get<any>(url);
  }

}
