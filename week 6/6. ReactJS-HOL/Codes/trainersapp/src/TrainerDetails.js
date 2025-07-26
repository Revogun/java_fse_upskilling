import React from 'react';
import { useParams } from 'react-router-dom';
import trainers from './TrainersMock';

function TrainerDetails() {
  const { id } = useParams();
  const trainer = trainers.find(t => t.trainerId === id);

  if (!trainer) {
    return <h3>Trainer not found!</h3>;
  }

  return (
    <div>
      <h2>{trainer.name} - Details</h2>
      <p><strong>ID:</strong> {trainer.trainerId}</p>
      <p><strong>Email:</strong> {trainer.email}</p>
      <p><strong>Phone:</strong> {trainer.phone}</p>
      <p><strong>Technology:</strong> {trainer.technology}</p>
      <p><strong>Skills:</strong> {trainer.skills}</p>
    </div>
  );
}

export default TrainerDetails;
