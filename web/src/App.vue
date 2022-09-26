<template>
  <NavBar />
  <router-view />
</template>

<script>
import NavBar from '@/components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'

export default {
  components: {
    NavBar,
  },
  setup() {
    $.ajax({
      url: "http://127.0.0.1:3000/user/account/token/",
      type: "post",
      data: {
        username: 'shane',
        password: 'pwd',
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });
    $.ajax({
      url: "http://127.0.0.1:3000/user/account/info/",
      type: "get",
      headers: {
        Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkOTZhM2RmNGFlOWY0ZGI2OTE1OWQyMzUwMzQ5MDlkOSIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY2NDE1NDc1MiwiZXhwIjoxNjY1MzY0MzUyfQ.QEKRyMdu_F_im1XrVtqsHq99E-o-q-3aBDvJyYS2Juk"
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      },
    });
    $.ajax({
      url: "http://127.0.0.1:3000/user/account/register/",
      type: "post",
      data: {
        username: 'andrew',
        password: 'pwd',
        confirmedPassword: "pwd",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });
  }
}
</script>

<style>
body {
  background-image: url("@/assets/images/background.png");
  background-size: cover;
}
</style>
