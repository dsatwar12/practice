import { Grid, Paper, TextField, Button } from "@mui/material"

import './login.css'
import { Link } from "react-router-dom"


export const Login=()=>{
    return <div className="container1">
       <Paper style={{padding:'200px'}}>
        <Grid
  container
  direction="column"
  justifyContent="center"
  alignItems="center"
>
    <h1>login page</h1>
    <TextField id="outlined-basic" label="email" variant="outlined" />
    <br />
    <TextField id="outlined-basic" label="password" variant="outlined" />
    <br />


    <Grid
  container
  direction="row"
  justifyContent="space-between"
  alignItems="center"
>
<Link to={'/register'}><Button variant="outlined">register</Button>
</Link>


<Link to={'/home'}>
<Button variant="contained">login</Button></Link>

    </Grid>

    
</Grid>
</Paper>
    </div>
    
    
    }