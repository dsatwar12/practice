import { useState } from "react"

export const UseStateHook=()=>{
   let [data,setdata]= useState("somthing")
    return <>
    <center>
        <input type="test" name="" id="" onChange={(g)=>{
            setdata(g.target.value)
        }}/>
   <h1> {data}</h1>
    
    
    
    </center>
    
    </>
}
