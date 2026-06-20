import React ,{useState} from 'react';

export const Loginfrospringboot = () => {
    const [user,setUser]=useState("");
    const [pswd,setPswd]=useState("");

    const handleClick=()=>{
        fetch("http://localhost:8081/login",{
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify({username:user,password:pswd}),
        })
            .then((res)=>res.text())
            .then((data)=>alert(data)) //backend reply
            .catch(()=>alert("Backend not reachable"));
    };

  return (
    <div style={{textAlign:"center",marginTop:"50px",backgroundColor:"#9167ed"}}>
        {/* <header>Login Page</header> */}
        <h2 style={{textAlign:"center",marginTop:"50px",backgroundColor:"#ffffff"}}>Login page</h2>
        <input 
        type="text"
        placeholder="Username"
        value={user}
        onChange={(e)=> setUser(e.target.value)}/>
        <br/><br/>
        <input 
        type="password"
        placeholder="Password"
        value={pswd}
        onChange={(e)=> setPswd(e.target.value)}/>
        <br/><br/>
        <button onClick={handleClick}>Login</button>
    </div>
  );
};
