<script lang="ts">
import ky from 'ky'

export const api = ky.create({
  prefixUrl: '/api',
  headers: { 'Content-Type': 'application/json' },
  timeout: 5000, // milliseconds
})

</script>