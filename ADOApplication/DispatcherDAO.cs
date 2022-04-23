using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;


namespace ADOApplication
{
    class DispatcherDAO
    {
        public void addDispatcher()
        {
            SqlConnection con = new SqlConnection();
            string ConnectionInformation = "Data Source=DESKTOP-ONO9RK6\\SQLEXPRESS;Initial Catalog=ADOApp;Integrated Security=True";
            con.ConnectionString = ConnectionInformation;
            Console.Write("Enter Dispatcher Id: ");
            int did = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Dispatcher Name: ");
            String dname = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Dispatcher Email: ");
            String dmail = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Dispatcher phone: ");
            String dphone = Convert.ToString(Console.ReadLine());

            SqlCommand com = new SqlCommand();
            com.Connection = con;
            com.CommandType = CommandType.StoredProcedure;
            com.CommandText = "PRC_ADD_NEW_DISPATCHER";
            con.Open();

            SqlParameter p1 = new SqlParameter("@D_id", SqlDbType.Int);
            p1.Direction = ParameterDirection.Input;
            p1.Value = did;
            com.Parameters.Add(p1);

            SqlParameter p2 = new SqlParameter("@D_name", SqlDbType.VarChar, 20);
            p2.Direction = ParameterDirection.Input;
            p2.Value = dname;
            com.Parameters.Add(p2);

            SqlParameter p3 = new SqlParameter("@D_email", SqlDbType.VarChar, 30);
            p3.Direction = ParameterDirection.Input;
            p3.Value = dmail;
            com.Parameters.Add(p3);

            SqlParameter p4 = new SqlParameter("@D_phone", SqlDbType.VarChar, 10);
            p4.Direction = ParameterDirection.Input;
            p4.Value = dphone;
            com.Parameters.Add(p4);

            com.ExecuteNonQuery();
            Console.WriteLine("Dispatcher :{0} ", com.Parameters["@D_id"].Value);
            Console.WriteLine("Dispatcher Name : {0}", com.Parameters["@D_name"].Value);
            Console.WriteLine("Dispatcher email : {0} ", com.Parameters["@D_email"].Value);
            Console.WriteLine("Dispatcher phone : {0} ", com.Parameters["@D_phone"].Value);
            Console.WriteLine("------------------------");
            con.Close();

        }
        public void DispatcherDetails()
        {
            SqlConnection con = new SqlConnection();
            string ConnectionInformation = "Data Source=DESKTOP-ONO9RK6\\SQLEXPRESS;Initial Catalog=ADOApp;Integrated Security=True";
            con.ConnectionString = ConnectionInformation;
            Console.Write("Enter Dispatcher Id: ");
            int did = Convert.ToInt32(Console.ReadLine());
            SqlCommand com = new SqlCommand();
            com.Connection = con;
            com.CommandType = CommandType.StoredProcedure;
            com.CommandText = "PRC_DISPLAY_DISPATCHER_DETAILS";
            con.Open();

            SqlParameter p1 = new SqlParameter("@D_id", SqlDbType.Int);
            p1.Direction = ParameterDirection.Input;
            p1.Value = did;
            com.Parameters.Add(p1);

            SqlParameter p2 = new SqlParameter("@D_name", SqlDbType.VarChar, 20);
            p2.Direction = ParameterDirection.Output;
            com.Parameters.Add(p2);

            SqlParameter p3 = new SqlParameter("@D_email", SqlDbType.VarChar, 30);
            p3.Direction = ParameterDirection.Output;
            com.Parameters.Add(p3);

            SqlParameter p4 = new SqlParameter("@D_phone", SqlDbType.VarChar, 10);
            p4.Direction = ParameterDirection.Output;
            com.Parameters.Add(p4);


            com.ExecuteReader();
            Console.WriteLine("Dispatcher :{0} ", com.Parameters["@D_id"].Value);
            Console.WriteLine("Dispatcher Name : {0}", com.Parameters["@D_name"].Value);
            Console.WriteLine("Dispatcher email : {0} ", com.Parameters["@D_email"].Value);
            Console.WriteLine("Dispatcher phone : {0} ", com.Parameters["@D_phone"].Value);
            Console.WriteLine("------------------------");
            con.Close();
        }
    }
}
