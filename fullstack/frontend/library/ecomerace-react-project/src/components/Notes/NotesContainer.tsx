import { Grid } from "@mui/material"
import { NotesCard } from "../cards/NotesCard"
import {allNotes} from 'take-notes'
import { useState } from "react"





export const NotesContainer=()=>{
    console.log()
    let [data,setData]=useState(allNotes.all())
    return <>
    <center>
        <h1>all notes

        </h1>
    </center>
    
    <Grid
  container
  direction="row"
  justifyContent="space-evenly"
  alignItems="center"
>
    {data.map((g:any)=>{
let hasName = g.hasOwnProperty('studentName');
if (hasName) {
  hasName=g.studentName
} else {
    hasName=g.StudentName
}



return <NotesCard url={g.fileUrl} name={hasName} language={g.language} topic={g.topic}/>

    })}



</Grid>
    
    
    
    
    </>
}