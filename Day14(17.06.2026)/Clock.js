import React from 'react'
export const Clock = () => {
    var  n=0;
    function Plus(){
        n=n+1
        document.getElementById("res").textContent=n
    }
    function Minus(){
        n=n-1
        document.getElementById("res").textContent=n
    }
  return (
    <div>
     <h1 id="res">0</h1>
      <button onClick={Plus}>+</button>
      <button onClick={Minus}>-</button>  
    </div>
  )
}
