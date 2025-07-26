import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(data => {
        const postList = data.map(post =>
          new Post(post.userId, post.id, post.title, post.body)
        );
        this.setState({ posts: postList });
      })
      .catch(error => {
        this.setState({ error });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
    console.error("Error details:", info);
  }

  render() {
    const { posts } = this.state;
    return (
      <div style={{ padding: '20px' }}>
        <h2>Blog Posts</h2>
        {posts.map(post => (
          <div key={post.id} style={{ borderBottom: '1px solid #ccc', marginBottom: '15px' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
