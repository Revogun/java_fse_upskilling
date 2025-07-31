import React from 'react';

function CohortDetails({ cohort }) {
  return (
    <div>
      <h3>{cohort.cohortCode}</h3>
      <p><strong>Name:</strong> {cohort.name}</p>
      <p>{`Status: ${cohort.status}`}</p>

    </div>
  );
}

export default CohortDetails;
