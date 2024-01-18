
import { RouterLink } from 'vue-router';
<template>
  <nav class="navbar nav" role="navigation" aria-label="main navigation">
  <div id="navbarBasicExample" class="navbar-menu">
    <div class="navbar-start">

      <router-link :to="{name: 'home'}" class="navbar-item">
        Home
      </router-link>

      <router-link :to="{name:'postulants'}" href="/postulants" class="navbar-item">
        Postulantes
      </router-link >

      <RouterLink :to="{name: 'empleados'}" class="navbar-item">
        Empleados
      </RouterLink>
    </div>
  </div>
</nav>
  
  <div class="columns is-centered app">
    <router-view/>
  </div>
</template>

<style lang="scss">
.app {
  padding: 10px;
  margin-top: 10px;
}
</style>
