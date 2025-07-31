import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

function EmployeeCard({ name, role }) {
  const theme = useContext(ThemeContext);

  return (
    <div className={`card ${theme}`}>
      <h3>{name}</h3>
      <p>{role}</p>
      <button className={`btn-${theme}`}>
        Message {name}
      </button>
    </div>
  );
}

export default EmployeeCard;
