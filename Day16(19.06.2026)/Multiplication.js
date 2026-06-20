import React ,{useState} from 'react'

export const Multiplication = () => {
    const [msg,setMsg]=useState("")
    const [num,setNum]=useState()
    function table(){
        fetch("http://localhost:8081/table/"+num)
        .then((res)=>res.text())
        .then((data)=>setMsg(data))
    }
  return (
    <div style={{ textAlign: "center", marginTop: "50px", backgroundColor: "#f79fff" }}>
        <h1>Multiplication Table </h1>
        <input type="number" value={num} onChange={(e)=>setNum(e.target.value)}></input>
        <button onClick={table}>Multiplication</button>
        <pre>{msg}</pre>
    </div>
  )
}
