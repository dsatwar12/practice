import { Grid } from "@mui/material"
import { Mycard } from "./Mycars"
import img from '../../static/images/1.webp'

export const CardContainer=()=>{
    return <>
    img1

    <Grid
  container
  direction="column-reverse"
  justifyContent="space-evenly"
  alignItems="flex-start"
  
  ><Mycard img={img}/></Grid>


</>
}