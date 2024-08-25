import { Rating } from "@mui/material"
import { Button } from "../components/Button"
import { MuiButtons } from "../components/mui/MuiButtons"
import { CustomStyles } from "../components/styles/CustomStyles"
import { Mynavbar } from "../components/mynavbar/Mynavbar"
import { Mycarousel } from "../components/mycarousel/Mycarousel"
import { CardContainer } from "../components/cards/CardContainer"
import { CardContainerApi } from "../components/cards/CardContainerApi"


export const Home=()=>{
return <>
<h1>im home page</h1>
<Mynavbar/>
<Mycarousel/>
<br />
<h1>api card container</h1>
<CardContainerApi/>
<br />
<CardContainer/>
<Button/>
<MuiButtons/>
<Rating name="no-value" value={null} />
<CustomStyles/>
</>


}