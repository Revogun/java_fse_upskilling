import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function MainDashboard() {
  const [view, setView] = useState('book');

  const showButtons = () => (
    <div style={{ marginBottom: '20px' }}>
      <button onClick={() => setView('book')}>Show Book</button>
      <button onClick={() => setView('blog')}>Show Blog</button>
      <button onClick={() => setView('course')}>Show Course</button>
    </div>
  );

  let content;

  // Using if-else for rendering
  if (view === 'book') {
    content = <BookDetails />;
  } else if (view === 'blog') {
    content = <BlogDetails />;
  } else {
    content = <CourseDetails />;
  }

  // Another way using ternary
  const isBlog = view === 'blog';

  // && rendering example
  const showTips = view === 'course' && <p>📌 Tip: Don’t forget to do your assignments!</p>;

  // .map() rendering with keys
  const list = ['React', 'Redux', 'Router'].map((item, idx) => (
    <li key={idx}>{item}</li>
  ));

  return (
    <div style={{ padding: '20px' }}>
      <h1>🧠 Blogger Dashboard</h1>

      {showButtons()}

      {/* Conditional rendering with if/else */}
      {content}

      {/* Ternary example */}
      <p>{isBlog ? 'You are reading a blog.' : 'Not a blog view.'}</p>

      {/* && conditional render */}
      {showTips}

      {/* List with map + key */}
      <h3>Technologies:</h3>
      <ul>{list}</ul>
    </div>
  );
}

export default MainDashboard;
