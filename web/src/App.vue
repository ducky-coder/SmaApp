<template>
  <div class="home">
    <h1>hello</h1>
    <h1>{{ bpi.data }}</h1>
  </div>
</template>

<script>

import axios from 'axios'

export default {
//API格納用のプロパティ
  data: function(){
    return{
      data:{
        bpi: 'hello'
      }
    }
  },
  mounted: function(){
    axios.get('http://localhost:8080/v1/matches/1/?condition=300')
        .then(res => this.bpi = res.data)
        .then(res => console.log(res))
        .catch(err => console.log(err))
  }
}
</script>