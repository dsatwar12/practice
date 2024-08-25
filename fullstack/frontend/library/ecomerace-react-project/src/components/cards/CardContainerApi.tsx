import { Grid } from "@mui/material"
import { Mycard } from "./Mycars"
import img from '../../static/images/1.webp'
import { useEffect, useState } from "react"
import { apicaller } from "../../api/api"

export const CardContainerApi=()=>{  let [apidata,setApidata]=useState([])
    useEffect(()=>{
        (async()=>{
          
           setApidata( await apicaller())
        })()
       
    },[])
    return <>
    img1

    <Grid
  container
  direction="column-reverse"
  justifyContent="space-evenly"
  alignItems="flex-start"
  
  >
    {apidata.map((a:any)=>{
    return    <Mycard img={a.image}/>
})}
    
    
    
    </Grid>


</>
}