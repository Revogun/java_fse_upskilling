import React from 'react';
import { render, screen } from '@testing-library/react';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort';
import '@testing-library/jest-dom';

describe('CohortDetails Component', () => {
  const testCohort = CohortData[0]; // REACT2025

  test('renders without crashing', () => {
    render(<CohortDetails cohort={testCohort} />);
    // Specifically check for the cohort code (in the h3)
    expect(screen.getByRole('heading', { name: testCohort.cohortCode })).toBeInTheDocument();
  });

  test('displays correct cohort data', () => {
    render(<CohortDetails cohort={testCohort} />);
    expect(screen.getByText(testCohort.name)).toBeInTheDocument();
    expect(screen.getByText(`Status: ${testCohort.status}`)).toBeInTheDocument();
  });
});
