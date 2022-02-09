<template>
  <div class="dashboard-container">
    <div class="app-container">
      <el-card shadow="never">
        <!-- elementui table -->
          <el-table :data="dataList" border style="width: 100%">
          <el-table-column fixed prop="name" label="Company"></el-table-column>
          <el-table-column fixed prop="version" label="Version"></el-table-column>
          <el-table-column fixed prop="companyPhone" label="Phone"></el-table-column>
          <el-table-column fixed prop="expirationDate" label="Expiration"></el-table-column>
          <el-table-column fixed prop="state" label="State"></el-table-column>
          <el-table-column fixed="right" label="操作" width="100">
            <template slot-scope="scope">
              <el-button @click="handleClick(scope.row)" type="text" size="small">Cheak</el-button>
              <el-button type="text" size="small">Edit</el-button>
            </template>
          </el-table-column>
        </el-table>
        <!-- elementui table -->
      </el-card>
     </div>
  </div>
</template>

<script>
import {list} from '@/api/base/sassClients'
export default {
  name: 'saas-clients-table-index',
  data() {
    return {
      dataList: []
    }
  },
  methods: {
    getList(){
      list().then(res => {
        this.dataList = res.data.data;
        console.log(res).data;
      })
    }
  },
  created() {
    this.getList();
  },
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
.alert {
  margin: 10px 0px 0px 0px;
}
.pagination {
  margin-top: 10px;
  text-align: right;
}
</style>
