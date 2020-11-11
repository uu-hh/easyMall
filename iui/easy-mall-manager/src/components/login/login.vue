<template>
  <div class="login-wrap">
    <el-form
      class="login-form"
      label-position="top"
      label-width="80px"
      :model="fromdata"
    >
      <h2>用户登录</h2>
      <el-form-item label="用户名">
        <el-input v-model="fromdata.username"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="fromdata.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      fromdata: {
        username: "",
        password: "",
      },
    };
  },
};
</script>

<style>
.login-wrap {
  height: 100%;
  background-color: dimgrey;
  /**弹性盒布局 */
  display: flex;
  justify-content: center;
  align-items: center;
}
.login-wrap .login-form {
  width: 400px;
  background-color: #fff;
  border-radius: 5px;
  padding: 50px;
}
.login-form .login-btm {
  width: 50%;
}
</style>
