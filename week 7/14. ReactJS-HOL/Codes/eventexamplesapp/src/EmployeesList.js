import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeesList() {
  const employees = [
    { id: 1, name: 'Revo', role: 'Frontend Dev' },
    { id: 2, name: 'Jane', role: 'Backend Dev' },
    { id: 3, name: 'John', role: 'QA Engineer' }
  ];

  return (
    <div>
      <h2>Employees List</h2>
      {employees.map(emp => (
        <EmployeeCard key={emp.id} name={emp.name} role={emp.role} />
      ))}
    </div>
  );
}

export default EmployeesList;
