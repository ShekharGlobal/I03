import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  profileData: FormGroup;

  constructor() {
    // Initialize the form with proper validations
    this.profileData = new FormGroup(
      {
      uname: new FormControl('Shekhar', 
        [
        Validators.required,
        Validators.minLength(3),
        Validators.maxLength(6)
        ]
    ),

      addr: new FormGroup(
        {
        address: new FormControl('', Validators.required),
      }
    ),

      gender: new FormControl('', Validators.required), // Gender validation

      country: new FormControl('', Validators.required) // Country validation
    }
  );
  }

  register(): void {
    // This function will only run if the form is valid
    if (this.profileData.valid) {
      console.log('Form Submitted', this.profileData.value);
    } else {
      console.log('Form Invalid');
    }
  }
}
