
import { Greeting } from "./Greeting";
const App1=()=> {
  return (
  <div>
    <center>
    <h1>MY APP1</h1>
    <h2>Happy Tracking</h2>
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFPmDH90b8x9jzNWuGxyKoeTRNu9HIYnEFuw&s" alt="birds"></img>
                <Greeting name="Suba" age={19}/>
                <Greeting name="Sri" age={20}/>
    </center>
  </div>
      );
    

}

export default App1;
