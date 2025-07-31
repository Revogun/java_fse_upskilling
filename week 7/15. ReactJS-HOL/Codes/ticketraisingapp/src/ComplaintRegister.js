import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (employeeName.trim() === '' || complaint.trim() === '') {
      alert('Please fill all the fields!');
      return;
    }

    const referenceNumber = 'REF' + Math.floor(100000 + Math.random() * 900000);
    alert(`Complaint submitted!\nReference Number: ${referenceNumber}`);

    // Clear the form
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={{ padding: '30px', maxWidth: '500px', margin: 'auto' }}>
      <h2>🛠️ Raise a Complaint</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Employee Name:</label><br />
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            placeholder="Enter your name"
            style={{ width: '100%', padding: '8px', marginTop: '5px', marginBottom: '15px' }}
          />
        </div>
        <div>
          <label>Complaint:</label><br />
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            placeholder="Describe your issue"
            rows="4"
            style={{ width: '100%', padding: '8px', marginTop: '5px', marginBottom: '15px' }}
          ></textarea>
        </div>
        <button type="submit" style={{ padding: '10px 20px' }}>Submit</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
