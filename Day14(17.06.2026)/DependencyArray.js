import React, { useEffect, useState } from 'react'

export const DependencyArray = () => {
    const [count,setCount]=useState(0);
    useEffect(()=>{
       // console.log("Count changed to:",count);
        alert("Count is now "+count);
    },[count]);
  return (
    <div>
        <h1>Count:{count}</h1>
        <button onClick={()=>setCount(count+1)}>Increase</button>
    </div>
  );
}
