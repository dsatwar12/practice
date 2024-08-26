import * as React from 'react';
import Box from '@mui/material/Box';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';

interface iNotesCard{
    url:any,
    name:any,
    language:any,
    topic:any
}



export const NotesCard:React.FC<iNotesCard>=({language,name,topic,url}) =>{
  return (
    <Box sx={{ minWidth: 275 }}>
      <Card variant="outlined">
      <>
    <CardContent>

      <Typography variant="h5" component="div">
        name:--{name}
      </Typography>
      <Typography sx={{ mb: 1.5 }} color="text.secondary">
        language:---{language}
      </Typography>
      <Typography variant="body2">
topic:---{topic}
      </Typography>
    </CardContent>
    <CardActions>
        <a href={url}>
      <Button size="small">download notes</Button></a>
    </CardActions>
  </>

      </Card>
    </Box>
  );
}