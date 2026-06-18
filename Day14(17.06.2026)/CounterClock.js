import React,{useState} from "react";
export const CounterClock = () => {
    const [count,setCount]=useState(0)
    // function plus(){
    //     setCount(count+1);
    // }
    // function minus(){
    //     setCount(count-1);
    // }
    // function reset(){
    //     setCount(0)
    // }
  return (
    <div style={{textAlign:"-khtml-center",marginTop:"50px"}}>
        <h1>Counter Clock</h1>
        <h2>{count}</h2>
        <button onClick={()=>setCount(count+1)}>+</button>
        <button onClick={()=>setCount(count-1)}>-</button>
        <button onClick={()=>setCount(0)}>reset</button>
    </div>
  )
}
