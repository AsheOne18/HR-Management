// https://eslint.org/docs/user-guide/configuring

module.exports = {
  root: true,
  parserOptions: {
    parser: 'babel-eslint'
  },
  env: {
    browser: true,
  },
  extends: [
    // https://github.com/vuejs/eslint-plugin-vue#priority-a-essential-error-prevention
    // consider switching to `plugin:vue/strongly-recommended` or `plugin:vue/recommended` for stricter rules.
    'plugin:vue/essential', 
    // https://github.com/standard/standard/blob/master/docs/RULES-en.md
    'standard'
  ],
  // required to lint *.vue files
  plugins: [
    'vue'
  ],
  // add your custom rules here
  rules: {
    "no-undef": 0, //Undeclared variables are not allowed
    "no-unused-vars": [0, {"vars": "all", "args": "after-used"}], //Unused variables or parameters after declaration are not allowed
    "no-tabs": 0, //tabs are not allowed

    "no-trailing-spaces": 0,
    "padded-blocks": 0,
    "no-control-regex": 0,

    // allow async-await
    'generator-star-spacing': 'off',

    "indent": [0, 2],//Indent style
    // "camelcase": [0, {"properties": "never"}], //force camel case naming convention
    "space-before-function-paren": [0, {"anonymous": "always", "named": "never"}], //space before parentheses in function definition
    // allow debugger during development
    'no-debugger': process.env.NODE_ENV === 'production' ? 'error' : 'off'
  }
}