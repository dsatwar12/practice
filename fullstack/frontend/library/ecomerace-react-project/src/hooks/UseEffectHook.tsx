import { useEffect, useState } from "react"
import { apicaller } from "../api/api"

export const  UseEffectHook=()=>{
    let [apidata,setApidata]=useState([])
useEffect(()=>{
    (async()=>{
      
       setApidata( await apicaller())
    })()
   
},[])
console.log(apidata)
    return <>
    api data
{apidata.map((a:any)=>{
    return    <img width="200px" height="200px" src={a.image} />
})}
    
    </>
}