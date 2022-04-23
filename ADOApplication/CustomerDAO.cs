using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace ADOApplication
{
    class CustomerDAO
    {
        public void addCustomer()
        {
            SqlConnection con = new SqlConnection();
            string ConnectionInformation = "Data Source=DESKTOP-ONO9RK6\\SQLEXPRESS;Initial Catalog=ADOApp;Integrated Security=True";
            con.ConnectionString = ConnectionInformation;
            Console.Write("Enter Customer Id: ");
            int cid = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Customer Name: ");
            String cname = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Email: ");
            String cmail = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer phone: ");
            String cphone = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Addressline1: ");
            String line1 = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Addressline2: ");
            String line2 = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Landmark1: ");
            String mark1 = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Landmark2: ");
            String mark2 = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Area: ");
            String area = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer City: ");
            String city = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer State: ");
            String state = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Customer Pincode: ");
            String pin = Convert.ToString(Console.ReadLine());

            SqlCommand com = new SqlCommand();
            com.Connection = con;
            com.CommandType = CommandType.StoredProcedure;
            com.CommandText = "PRC_ADD_NEW_CUSTOMER";
            con.Open();
            SqlParameter p1 = new SqlParameter("@c_id", SqlDbType.Int);
            p1.Direction = ParameterDirection.Input;
            p1.Value = cid;
            com.Parameters.Add(p1);

            SqlParameter p2 = new SqlParameter("@c_name", SqlDbType.VarChar, 20);
            p2.Direction = ParameterDirection.Input;
            p2.Value = cname;
            com.Parameters.Add(p2);

            SqlParameter p3 = new SqlParameter("@c_mail", SqlDbType.VarChar, 30);
            p3.Direction = ParameterDirection.Input;
            p3.Value = cmail;
            com.Parameters.Add(p3);

            SqlParameter p4 = new SqlParameter("@c_phone", SqlDbType.VarChar, 10);
            p4.Direction = ParameterDirection.Input;
            p4.Value = cphone;
            com.Parameters.Add(p4);

            SqlParameter p5 = new SqlParameter("@c_line1", SqlDbType.VarChar, 20);
            p5.Direction = ParameterDirection.Input;
            p5.Value = line1;
            com.Parameters.Add(p5);

            SqlParameter p6 = new SqlParameter("@c_line2", SqlDbType.VarChar, 20);
            p6.Direction = ParameterDirection.Input;
            p6.Value = line2;
            com.Parameters.Add(p6);

            SqlParameter p7 = new SqlParameter("@c_mark1", SqlDbType.VarChar, 20);
            p7.Direction = ParameterDirection.Input;
            p7.Value = mark1;
            com.Parameters.Add(p7);

            SqlParameter p8 = new SqlParameter("@c_mark2", SqlDbType.VarChar, 20);
            p8.Direction = ParameterDirection.Input;
            p8.Value = mark2;
            com.Parameters.Add(p8);

            SqlParameter p9 = new SqlParameter("@c_area", SqlDbType.VarChar, 20);
            p9.Direction = ParameterDirection.Input;
            p9.Value = area;
            com.Parameters.Add(p9);

            SqlParameter p10 = new SqlParameter("@c_city", SqlDbType.VarChar, 20);
            p10.Direction = ParameterDirection.Input;
            p10.Value = city;
            com.Parameters.Add(p10);

            SqlParameter p11 = new SqlParameter("@c_state", SqlDbType.VarChar, 20);
            p11.Direction = ParameterDirection.Input;
            p11.Value = state;
            com.Parameters.Add(p11);

            SqlParameter p12 = new SqlParameter("@c_pincode", SqlDbType.VarChar, 6);
            p12.Direction = ParameterDirection.Input;
            p12.Value = pin;
            com.Parameters.Add(p12);

            com.ExecuteNonQuery();
            Console.WriteLine("Customer Id :{0} ", com.Parameters["@c_id"].Value);
            Console.WriteLine("Customer Name : {0}", com.Parameters["@c_name"].Value);
            Console.WriteLine("Customer email : {0} ", com.Parameters["@c_mail"].Value);
            Console.WriteLine("Customer Phone : {0} ", com.Parameters["@c_phone"].Value);
            Console.WriteLine("customer Addressline1 :{0} ", com.Parameters["@c_line1"].Value);
            Console.WriteLine("Customer Addressline2 : {0}", com.Parameters["@c_line2"].Value);
            Console.WriteLine("Customer Landmark1 : {0} ", com.Parameters["@c_mark1"].Value);
            Console.WriteLine("Customer Landmark2 : {0} ", com.Parameters["@c_mark2"].Value);
            Console.WriteLine("Customer Area :{0} ", com.Parameters["@c_area"].Value);
            Console.WriteLine("Customer City : {0}", com.Parameters["@c_city"].Value);
            Console.WriteLine("Customer State : {0} ", com.Parameters["@c_state"].Value);
            Console.WriteLine("Customer Pincode : {0} ", com.Parameters["@c_pincode"].Value);
            Console.WriteLine("------------------------");
            con.Close();
        }
        public void CustomerDetailsById()
        {
            SqlConnection con = new SqlConnection();
            string ConnectionInformation = "Data Source=DESKTOP-ONO9RK6\\SQLEXPRESS;Initial Catalog=ADOApp;Integrated Security=True";
            con.ConnectionString = ConnectionInformation;
            Console.Write("Enter Customer Id: ");
            int cid = Convert.ToInt32(Console.ReadLine());

            SqlCommand com = new SqlCommand();
            com.Connection = con;
            com.CommandType = CommandType.StoredProcedure;
            com.CommandText = "PRC_DISPLAY_CUSTOMER_DETAILS";
            con.Open();
            SqlParameter p1 = new SqlParameter("@c_id", SqlDbType.Int);
            p1.Direction = ParameterDirection.Input;
            p1.Value = cid;
            com.Parameters.Add(p1);

            SqlParameter p2 = new SqlParameter("@c_name", SqlDbType.VarChar, 20);
            p2.Direction = ParameterDirection.Output;
            com.Parameters.Add(p2);

            SqlParameter p3 = new SqlParameter("@c_mail", SqlDbType.VarChar, 30);
            p3.Direction = ParameterDirection.Output;
            com.Parameters.Add(p3);

            SqlParameter p4 = new SqlParameter("@c_phone", SqlDbType.VarChar, 10);
            p4.Direction = ParameterDirection.Output;
            com.Parameters.Add(p4);

            SqlParameter p5 = new SqlParameter("@c_line1", SqlDbType.VarChar, 20);
            p5.Direction = ParameterDirection.Output;
            com.Parameters.Add(p5);

            SqlParameter p6 = new SqlParameter("@c_line2", SqlDbType.VarChar, 20);
            p6.Direction = ParameterDirection.Output;
            com.Parameters.Add(p6);

            SqlParameter p7 = new SqlParameter("@c_mark1", SqlDbType.VarChar, 20);
            p7.Direction = ParameterDirection.Output;
            com.Parameters.Add(p7);

            SqlParameter p8 = new SqlParameter("@c_mark2", SqlDbType.VarChar, 20);
            p8.Direction = ParameterDirection.Output;
            com.Parameters.Add(p8);

            SqlParameter p9 = new SqlParameter("@c_area", SqlDbType.VarChar, 20);
            p9.Direction = ParameterDirection.Output;
            com.Parameters.Add(p9);

            SqlParameter p10 = new SqlParameter("@c_city", SqlDbType.VarChar, 20);
            p10.Direction = ParameterDirection.Output;
            com.Parameters.Add(p10);

            SqlParameter p11 = new SqlParameter("@c_state", SqlDbType.VarChar, 20);
            p11.Direction = ParameterDirection.Output;
            com.Parameters.Add(p11);

            SqlParameter p12 = new SqlParameter("@c_pincode", SqlDbType.VarChar, 6);
            p12.Direction = ParameterDirection.Output;
            com.Parameters.Add(p12);

            com.ExecuteNonQuery();
            Console.WriteLine("Customer Id :{0} ", com.Parameters["@c_id"].Value);
            Console.WriteLine("Customer Name : {0}", com.Parameters["@c_name"].Value);
            Console.WriteLine("Customer email : {0} ", com.Parameters["@c_mail"].Value);
            Console.WriteLine("Customer Phone : {0} ", com.Parameters["@c_phone"].Value);
            Console.WriteLine("customer Addressline1 :{0} ", com.Parameters["@c_line1"].Value);
            Console.WriteLine("Customer Addressline2 : {0}", com.Parameters["@c_line2"].Value);
            Console.WriteLine("Customer Landmark1 : {0} ", com.Parameters["@c_mark1"].Value);
            Console.WriteLine("Customer Landmark2 : {0} ", com.Parameters["@c_mark2"].Value);
            Console.WriteLine("Customer Area :{0} ", com.Parameters["@c_area"].Value);
            Console.WriteLine("Customer City : {0}", com.Parameters["@c_city"].Value);
            Console.WriteLine("Customer State : {0} ", com.Parameters["@c_state"].Value);
            Console.WriteLine("Customer Pincode : {0} ", com.Parameters["@c_pincode"].Value);
            Console.WriteLine("------------------------");
            con.Close();

        }
        public void CustomerDetails()
        {
            SqlConnection con = new SqlConnection();

            string ConnectionInformation = "Data Source=DESKTOP-ONO9RK6\\SQLEXPRESS;Initial Catalog=ADOApp;Integrated Security=True";
            con.ConnectionString = ConnectionInformation;
            SqlCommand com = new SqlCommand();

            com.Connection = con;
            com.CommandType = CommandType.Text;
            com.CommandText = "select * from Customer";

            con.Open();
            SqlDataReader rd = com.ExecuteReader();

            while (rd.Read())
            {
                Console.WriteLine("Customer Id :{0} ", rd.GetInt32(0));
                Console.WriteLine("Customer Name : {0}", rd.GetString(1));
                Console.WriteLine("Customer Email: {0} ", rd.GetString(2));
                Console.WriteLine("Customer Phone:{0} ", rd.GetString(3));
                Console.WriteLine("Customer Addressline 1 : {0}", rd.GetString(4));
                Console.WriteLine("Customer Addressline2: {0} ", rd.GetString(5));
                Console.WriteLine("Customer Landmark1 :{0} ", rd.GetString(6));
                Console.WriteLine("Customer landmark2 : {0}", rd.GetString(7));
                Console.WriteLine("Customer Area: {0} ", rd.GetString(8));
                Console.WriteLine("Customer City :{0} ", rd.GetString(9));
                Console.WriteLine("Customer State: {0}", rd.GetString(10));
                Console.WriteLine("Customer pincode: {0} ", rd.GetString(11));

                Console.WriteLine("------------------------");
            }
            rd.Close();

            con.Close();

        }
    }
}
