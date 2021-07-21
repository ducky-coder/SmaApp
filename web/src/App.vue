<template>
  <div class="app">
    <h3>登録API↓</h3>
    <p>{{ create }}</p>
    <h3>ログインAPI↓</h3>
    <p>{{ login }}</p>
    <h3>ログアウトAPI↓</h3>
    <p>{{ logout }}</p>
    <h3>ユーザー編集API結果(1であれば成功)↓</h3>
    <p>{{ updateUser }}</p>
    <h3>対戦相手情報↓</h3>
    <p>{{ opponent }}</p>
    <h3>ユーザーランキング情報↓</h3>
    <p>{{ userRanking }}</p>
    <h3>レート情報↓</h3>
    <p>{{ rate }}</p>
    <h3>ユーザー情報↓</h3>
    <p>{{ user }}</p>
    <h3>マッチ履歴↓</h3>
    <p>{{ matchHistory }}</p>
    <h3>キャラクターランキング情報↓</h3>
    <p>{{ characterRanking }}</p>
  </div>
</template>

<script>

import axios from 'axios'

export default {
  data() {
    return{
      create: [],
      login: [],
      logout: [],
      updateUser: [],
      opponent: [],
      userRanking: [],
      rate: [],
      user: [],
      matchHistory: [],
      characterRanking: []
    }
  },
  created() {
    this.getCreate()
    this.getLogin()
    this.getLogout()
    this.putUpdateUser()
    this.getOpponent()
    this.getUserRanking()
    this.getRate()
    this.getUserFromName()
    this.getMatchHistory()
    this.getCharacterRanking()
  },
  methods: {
    getCreate() {
      axios.get('http://localhost:8080/v1/users/create')
          .then(res => this.create = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    putUpdateUser() {
      axios.put('http://localhost:8080/v1/users/1',{
        "name":"updateUser",
        "password":"updatePassword"
      })
          .then(res => this.updateUser = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getLogin() {
      axios.get('http://localhost:8080/v1/users/login')
          .then(res => this.login = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getLogout() {
      axios.get('http://localhost:8080/v1/users/logout')
          .then(res => this.logout = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getOpponent() {
      axios.get('http://localhost:8080/v1/matches/1/?condition=300')
          .then(res => this.opponent = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getUserRanking() {
      axios.get('http://localhost:8080/v1/users/ranking')
          .then(res => this.userRanking = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getRate() {
      axios.get('http://localhost:8080/v1/users/1/rate')
          .then(res => this.rate = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getUserFromName() {
      axios.get('http://localhost:8080/v1/users/updateUser')
          .then(res => this.user = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getMatchHistory() {
      axios.get('http://localhost:8080/v1/matches/history/1')
          .then(res => this.matchHistory = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    },
    getCharacterRanking() {
      axios.get('http://localhost:8080/v1/characters/ranking')
          .then(res => this.characterRanking = res.data)
          .then(res => console.log(res))
          .catch(err => console.log(err))
    }
  }
}
</script>