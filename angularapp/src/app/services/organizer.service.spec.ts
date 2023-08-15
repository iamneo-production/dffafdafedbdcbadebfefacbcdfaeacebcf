import { TestBed } from '@angular/core/testing';

import { OrganizerService } from './organizer.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('OrganizerService', () => {
  let service: OrganizerService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(OrganizerService);
  });

  fit('should create organizerServices', () => {
    expect(service).toBeTruthy();
  });
});
