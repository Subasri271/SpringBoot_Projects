import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
//import Team2 from './Team2';
import reportWebVitals from './reportWebVitals';
// import {App} from './App';
// import {Compute} from './Compute';
//import {EffecthookEg} from './EffecthookEg';
//import {CounterClock} from './CounterClock';
import {LoginValidation} from './LoginValidation';
import {Loginhook} from './Loginhook';








const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
   {/* <App /> */}
   {/* <App1/> */}
   {/* <Compute /> */}
   {/* <EffecthookEg /> */}
   {/* <LoginValidation /> */}
   <Loginhook />
    
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
