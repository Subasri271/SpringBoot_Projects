import React from "react";
import { useEffect, useState } from "react";
export const EffecthookEg=()=>{
    const [message,setMessage] = useState("Loading...");
    const [count,setCount] = useState(0);
    useEffect(()=>{
        setTimeout(()=>{
            setMessage("Data loaded");
        },3000);
    },[]);
    useEffect(()=>{
        const time=setInterval(()=>{
            setCount(e=>e+1);
        },1000);
       return ()=> clearInterval(time);
    },[]);
    return (
        <div style={{textAlign:"center",marginTop: "50px"}}>
            <h1>{message}</h1>
            <h1>Count: {count}</h1>
        </div>
    );
}