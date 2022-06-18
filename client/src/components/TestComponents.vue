<template>
  <div>
    <h1>Test</h1>
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
  message.value = await (await api.get("user/test")).json()
} 


</script>

