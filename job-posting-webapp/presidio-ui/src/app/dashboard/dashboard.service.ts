import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class DashboardService { 

  constructor(private http: HttpClient) { }

  getAllJobs(url): Observable<any> {
    return this.http.get<any>(url).pipe(catchError(this.handleError));
  }

  errorHandler(error: HttpErrorResponse) {
    return throwError(error);
  }
  private handleError(error: HttpErrorResponse) {
    return throwError(
      'Something bad happened; please try again later.');
  }
  
}
