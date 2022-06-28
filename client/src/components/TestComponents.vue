<template>
  <div class="test-component">
    <p>{{ message }}</p>
    <button @click="test">test</button>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import ky from 'ky'

let message = ref()

const api = ky.create({
  prefixUrl: '/api',
  headers: { 'Content-Type': 'application/json' },
  timeout: 5000, // milliseconds
})

async function test() {
  message.value = await api.get("user/test").json()
} 
</script>

<style scoped>
.test-component {
  margin: 0.3rem;
}
</style>
