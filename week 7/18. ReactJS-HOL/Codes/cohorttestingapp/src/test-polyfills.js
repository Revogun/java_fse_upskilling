module.exports = {
  setupFilesAfterEnv: ['<rootDir>/src/setupTests.js'],
  setupFiles: ['<rootDir>/src/test-polyfills.js'], // ✅ runs before enzyme loads
  testEnvironment: 'jsdom',
};
