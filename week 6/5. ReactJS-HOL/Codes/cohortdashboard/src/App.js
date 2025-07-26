import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div style={{ display: 'flex', flexWrap: 'wrap', gap: '20px', padding: '20px' }}>
      <CohortDetails
        name="React Bootcamp"
        startDate="2025-07-01"
        endDate="2025-08-15"
        status="ongoing"
      />
      <CohortDetails
        name="Java Full Stack"
        startDate="2025-05-10"
        endDate="2025-06-30"
        status="completed"
      />
      <CohortDetails
        name="Python DS"
        startDate="2025-04-01"
        endDate="2025-05-15"
        status="completed"
      />
    </div>
  );
}

export default App;
