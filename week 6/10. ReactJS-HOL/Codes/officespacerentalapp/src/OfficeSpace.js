import React from 'react';

const OfficeSpace = () => {
  // 1. Simple JSX heading
  const heading = <h1>🏢 Office Space Rental Listings</h1>;

  // 2. Office Image
  const image = (
    <img
      src="https://images.unsplash.com/photo-1570129477492-45c003edd2be"
      alt="Office Space"
      style={{ width: '400px', borderRadius: '10px' }}
    />
  );

  // 3. Single Office Object
  const office = {
    name: "CyberPark One",
    rent: 75000,
    address: "MG Road, Bangalore"
  };

  // 4. Office List (array of objects)
  const officeList = [
    { id: 1, name: "Infinity Tower", rent: 85000, address: "Hyderabad" },
    { id: 2, name: "TechNest Hub", rent: 58000, address: "Chennai" },
    { id: 3, name: "WorkSquare", rent: 62000, address: "Delhi" },
    { id: 4, name: "StartupSpace", rent: 55000, address: "Pune" }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      {heading}
      <br />
      {image}

      <h2>Featured Office:</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent > 60000 ? 'green' : 'red' }}>
          ₹{office.rent}
        </span>
      </p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>All Listings:</h2>
      {officeList.map(item => (
        <div
          key={item.id}
          style={{
            border: '1px solid #ccc',
            borderRadius: '10px',
            padding: '10px',
            marginBottom: '10px'
          }}
        >
          <p><strong>Name:</strong> {item.name}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: item.rent > 60000 ? 'green' : 'red' }}>
              ₹{item.rent}
            </span>
          </p>
          <p><strong>Address:</strong> {item.address}</p>
        </div>
      ))}
    </div>
  );
};

export default OfficeSpace;
